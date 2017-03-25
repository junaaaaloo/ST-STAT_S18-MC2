freqPics = function(nums,actual, ideal, name) {
  png(paste(name, "hist.png"))
  hist(nums)
  dev.off()
  prob <- c(actual, ideal)
  png(paste(name, "bar.png"))
  barplot(prob, main = "Actual vs Ideal",ylab = "Probability", col = c("blue","red"))
  dev.off()
  
}

binomial = function(size,proba,nums) {
  sumNums = c(0)
  for(i in nums){
    sumNums[1] = sumNums[1] + dbinom(i,size,proba)
  }
  y = sumNums[1]/length(nums)
  return(y)
}

binomialProb = function(size,proba,nums) {
  sumNums = c()
  
  for(i in nums){
    sumNums = append(sumNums,dbinom(i,size,proba))
  }
  return(sumNums)
}

negbinomial = function(failure, success,proba) {
  sumNums = c(0)
  for(i in failure){
    sumNums[1] = sumNums[1] + dnbinom(i,success,proba)
  }
  y = sumNums[1]/length(failure)
  return(y)
}

negbinomialProb = function(failure, success,proba) {
  sumNums = c()
  for(i in failure){
    sumNums = append(sumNums,dbinom(i,success,proba))
  }
  return(sumNums)
}

hyper = function(succPop, failPop, size, nums) {
  sumNums = c(0)
  for(i in nums){
    sumNums[1] = sumNums[1] + dhyper(i,succPop,failPop,size)
  }
  y = sumNums[1]/length(nums)
  return(y)
}

hyperProb = function(succPop, failPop, size, nums) {
  sumNums = c()
  
  for(i in nums){
    sumNums = append(sumNums,dhyper(i,succPop,failPop,size))
  }
  return(sumNums)
}
