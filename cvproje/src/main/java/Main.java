public class Main {
    public static void main(String[] args) {
        String pdfPath = "Esma_Ozgecmis.pdf";
        // Senin klasöründeki isme göre güncellendi
        String imagePath = "photo.jpg.jpeg";

        CvGenerator cvGenerator = new CvGenerator();
        cvGenerator.generatePDF(pdfPath, imagePath);
    }
}