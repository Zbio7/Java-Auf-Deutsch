
class Robot3 {
    EncryptedEMail encryptedEMail = new EncryptedEMail();

    void decryptSender() {
       
        for (int x = 0; x < 4; x++) {
           
            for (int y = 0; y < 28; y++) {
               
                System.out.print(encryptedEMail.decryptChar(x, y));
            }
           
            System.out.println();
        }
    }
}
