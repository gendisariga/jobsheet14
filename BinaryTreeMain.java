package jobsheet14;

public class BinaryTreeMain {
    public static void main(String[] args) {

    BinaryTree11 bst = new BinaryTree11();
        // insert vua rekursif 
    bst.add(new Mahasiswa11("244160121", "Ali", "A", 3.57));
    bst.add(new Mahasiswa11("244160221", "Badar", "B", 3.85));
    bst.add(new Mahasiswa11("244160185", "Candra", "C", 3.21));
    bst.add(new Mahasiswa11("244160220", "Dewi", "B", 3.54));      
    
    System.out.println("\nDaftar semua mahasiswa (in order traversal):");
    bst.traverseInOrder(bst.root);

    System.out.println("\nData Mahasiswa dengan IPK Terkecil:");
    bst.cariMinIPK();

    System.out.println("\nData Mahasiswa dengan IPK Terbesar:");
    bst.cariMaxIPK();

    System.out.println("\nMahasiswa dengan IPK di atas 3.50");
    bst.tampilMahasiswaIPKDiAtas(3.50);
}
}
    

