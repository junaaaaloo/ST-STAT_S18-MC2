package samp;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RConnection connection = null;
		String place = "C:\\\\Users\\\\Angel\\\\Documents\\\\2nd year - 2nd Term\\\\ST-STAT\\\\ST-STAT_S18-MC2\\\\r-java";
		try{
			PrintWriter pw = new PrintWriter(new File ("data.csv"));
			StringBuilder sb = new StringBuilder();
			connection = new RConnection();
			connection.eval("source('"+place+"\\\\process.R')");
			//rbinom(trials, number of coins\picks, probablity)
			connection.eval("numbers = rbinom(100,50,0.5)");
			String[] numbers = connection.eval("numbers").asStrings();
			for(String j:numbers){
            	sb.append(j);
            	sb.append(",");
			}
			sb.append("Random Numbers\n");
			connection.eval("aveProb = binomial(50,0.5,numbers)");
			double probability = connection.eval("aveProb").asDouble();
			System.out.println("The probability is=" + probability);
			//binomialProb(number of coins\flips
			connection.eval("probs = binomialProb(50,0.5,numbers)");
			String[] prob = connection.eval("probs").asStrings();
			connection.eval("freqPics(numbers,aveProb,0.5,'binom')");
			for(String i:prob){
            	sb.append(i);
            	sb.append(",");
			}
			sb.append("Probabilities");
			pw.write(sb.toString());
			pw.close();
		} catch(RserveException e) {
			e.printStackTrace();
		} catch(REXPMismatchException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}

	}

}
