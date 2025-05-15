
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-DATA MAHASISWA-");
        System.out.println("Masukkan nama mahasiswa:");
        String namaMhs = sc.nextLine();
        System.out.println("Masukkan alamat mahasiswa:");
        String alamatMhs = sc.nextLine();
        Student mhs = new Student(namaMhs, alamatMhs);

        System.out.print("Berapa mata kuliah yang diambil?: ");
        int jumlahMk = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahMk; i++) {
            System.out.print("Nama mata kuliah ke-" + (i + 1) + ": ");
            String mk = sc.nextLine();
            System.out.print("Nilai: ");
            int nilai = sc.nextInt();
            sc.nextLine();
            mhs.addCourseGrade(mk, nilai);
        }
        
        System.out.println("\n-DATA DOSEN-");
        System.out.println("\nMasukkan nama dosen:");
        String namaDosen = sc.nextLine();
        System.out.println("Masukkan alamat dosen:");
        String alamatDosen = sc.nextLine();
        Teacher dosen = new Teacher(namaDosen, alamatDosen);
        
        System.out.print("Berapa mata kuliah yang diajar?: ");
        int jumlahAmpu = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < jumlahAmpu; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
            String matkul = sc.nextLine();
            if (!dosen.addCourse(matkul)) {
                System.out.println("Mata kuliah sudah ada, tidak ditambahkan.");
            }
        }
        
        System.out.println(dosen);
        
        System.out.print("\nMasukkan nama mata kuliah yang ingin dihapus dari dosen: ");
        String hapusMk = sc.nextLine();
        if (dosen.removeCourse(hapusMk)) {
            System.out.println("Mata kuliah berhasil dihapus.");
        } else {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
        System.out.println("\n===============DATA MAHASISWA==================");
        mhs.printGrades();
        System.out.println("Rata-rata: " + mhs.getAverageGrade());
        System.out.println(mhs);
        
        System.out.println("\n===============DATA DOSEN==================");
        System.out.println(dosen);
        dosen.printCourses();
        sc.close();
    }
}
