import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class CvGenerator {

    public void generatePDF(String dest, String imagePath) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();

            // 1. Fotoğraf Ekleme
            try {
                Image img = Image.getInstance(imagePath);
                img.scaleAbsolute(100, 100);
                img.setAlignment(Element.ALIGN_RIGHT);
                document.add(img);
            } catch (Exception e) {
                System.out.println("Fotoğraf bulunamadı: " + e.getMessage());
            }

            // 2. Kişisel Bilgiler
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK);
            Font normalFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);

            document.add(new Paragraph("ESMANUR UZUN", headerFont));
            document.add(new Paragraph("Yazilim Muhendisi", normalFont));
            document.add(new Paragraph("Email: esmanur.uzun@example.com | Telefon: +90 555 123 45 67", normalFont));
            document.add(new Chunk("\n"));

            // 3. Eğitim Bilgileri
            document.add(new Paragraph("Egitim", headerFont));
            document.add(new Paragraph("- Kirklareli Universitesi, Yazilim Muhendisligi (2025 - Devam Ediyor)", normalFont));
            document.add(new Chunk("\n"));

            // 4. İş Deneyimleri (3 Hayali/Gerçek Deneyim)
            document.add(new Paragraph("Is Deneyimleri / Projeler", headerFont));

            document.add(new Paragraph("1. Havacilikta Yapay Zeka - TEKNOFEST Kore Team (2026)", boldFont));
            document.add(new Paragraph("- Otonom insansız hava araçları için OpenCV ve YOLOv8 kullanılarak görüntü işleme ve backend algoritmaları geliştirildi.", normalFont));
            document.add(new Chunk("\n"));

            document.add(new Paragraph("2. Backend Gelistirici - CloudNet Bilisim (Ocak 2025 - Mayis 2025)", boldFont));
            document.add(new Paragraph("- C, C++ ve Python dilleri kullanılarak veri yapıları optimizasyonları ve mikroservis mimarisi tasarımı yapıldı.", normalFont));
            document.add(new Chunk("\n"));

            document.add(new Paragraph("3. Gomulu Sistemler Muhendisi - IoT SmartHome (Eylul 2024 - Aralik 2024)", boldFont));
            document.add(new Paragraph("- Akıllı ev sistemleri için TinyML tabanlı sensör verisi analizi ve donanım programlaması gerceklestirildi.", normalFont));

            System.out.println("PDF basariyla olusturuldu: " + dest);

        } catch (DocumentException | java.io.IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}