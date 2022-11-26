public class mainProgram {
    public static void main(String[] args) {
      // Membuat Object
      Manager Nana = new Manager("Nana",8000000,1000000);
      Programmer Beno = new Programmer("Beno",4800000,600000);
  
      // /* TUGAS PADA PRAKTIKUM 3 YANG MASIH MENGGUNAKAN SETTER DAN GETTER */
      // Nana.setNama("Nana");
      // Nana.setGajiPokok(8000000);
      // Nana.setTunjangan(1000000);
  
      // Beno.setNama("Beno");
      // Beno.setGajiPokok(4800000);
      // Beno.setBonus(600000)
  
      /* Mengakses Method */
      Nana.cetakInfo();
      System.out.println();
      Beno.cetakInfo();
    }
  }