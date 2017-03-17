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