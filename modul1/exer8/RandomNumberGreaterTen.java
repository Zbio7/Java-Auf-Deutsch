package exer8;

class RandomNumberGreaterTen {

    RandomNumber rand = new RandomNumber();
    
    int greaterTen(){
        
       int n = rand.giveNumber();
       
       
       
       while (n<=10){
           
          n = rand.giveNumber();
       }
        return n;
}

    
}