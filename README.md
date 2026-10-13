# Java ile Nesne Yönelimli PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Kırklareli Üniversitesi Yazılım Mühendisliği bölümü ödevi kapsamında Java programlama dili ve iText kütüphanesi kullanılarak geliştirilmiş bir PDF özgeçmiş oluşturma uygulamasıdır. 

Proje, Nesne Yönelimli Programlama (OOP) prensiplerine sadık kalınarak tasarlanmış olup, veri üretim süreci tek bir main metodu içerisine sıkıştırılmamış, modüler bir mimariyle ayrı bir sınıfa (`CvGenerator`) taşınmıştır.

## 🛠 Kullanılan Teknolojiler ve Bileşenler

*   **Java (JDK 27):** Uygulamanın temel geliştirme dili.
*   **Maven:** Proje bağımlılıklarının (`pom.xml`) yönetimi için kullanılmıştır.
*   **iText Kütüphanesi (v5.5.13.3):** Java ortamında PDF belgesi oluşturmak, şekillendirmek ve resim eklemek amacıyla entegre edilmiştir.
*   **IntelliJ IDEA:** Geliştirme ortamı (IDE) olarak kullanılmıştır.

## 🏗 Proje Mimarisi ve Kullanılan Nesneler

Projenin mimarisi, kod okunabilirliğini ve tekrar edilebilirliğini artırmak amacıyla iki ana sınıfa bölünmüştür:

1.  **`Main.java` (Başlatıcı Sınıf):** Uygulamanın giriş noktasıdır. Yalnızca dosya yollarını belirleme ve süreci başlatma sorumluluğuna sahiptir (Single Responsibility Principle).
2.  **`CvGenerator.java` (İş Mantığı Sınıfı):** PDF'in fiziksel olarak yaratılması, metinlerin biçimlendirilmesi (Font, Chunk, Paragraph nesneleri) ve fotoğrafın (Image nesnesi) yerleştirilmesinden sorumludur.

### Kullanılan Temel iText Nesneleri ve Amaçları
*   `Document`: PDF sayfa yapısını temsil eder.
*   `PdfWriter`: Oluşturulan belgenin fiziksel bir `.pdf` dosyası olarak diske yazılmasını sağlayan araçtır.
*   `Image`: Özgeçmişe vesikalık fotoğrafın sağ üst köşeye hizalanarak eklenmesini sağlayan nesnedir.
*   `Font` & `Paragraph`: Metinlerin kalınlık, boyut ve hiyerarşik düzenini ayarlamak için kullanılmıştır.

## 🚀 Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza klonlayın veya zip olarak indirin.
2. Projeyi bir Java IDE'sinde (IntelliJ IDEA veya Eclipse) Maven projesi olarak açın.
3. Kök dizinde `photo.jpg.jpeg` adında bir fotoğraf olduğundan emin olun.
4. `Main.java` sınıfını çalıştırın.
5. İşlem tamamlandığında konsolda başarı mesajı belirecek ve proje dizininde PDF dosyanız hazır olacaktır.
