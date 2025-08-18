package exer9;

class Robot2 {
    String[] clues = {"Boesewicht mag keine Papageien.", "Boesewicht kennt sich mit Computern aus.", 
                        "E-Mail-Adresse des Boesewichts."};
    
    
  String giveClue(int index){
       
       return clues[index];
   }
    
   void printClues(){
        
        for (int num=0;num<clues.length;num++){
            
            System.out.println(giveClue(num));
        }
    }
    
}
