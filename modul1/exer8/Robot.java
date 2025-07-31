package exer8;

class Robot {
    String sentence = "Ich kann sprechen!";
    RandomNumber rand = new RandomNumber();
    
    int n;
    
    void speakSeveralTimes(int n){
        
        for (int i=0;i<n;i++){
        
        System.out.println(sentence);
        
            
        }
    }
    
    void speak(){
        
        speakSeveralTimes(rand.giveNumber());
    } 
}