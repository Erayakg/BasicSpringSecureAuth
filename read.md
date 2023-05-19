# SpringSecureAuth

## 📌 İçindekiler

- [SpringSecureAuth](#springsecureauth)
  - [📌 İçindekiler](#-i̇çindekiler)
  - [🔐 Proje Hakkında](#-proje-hakkında)
  - [⚙️ Özellikler](#️-özellikler)
  - [🚀 Nasıl Çalışır?](#-nasıl-çalışır)
  - [🔮 Katkıda Bulunmak](#-katkıda-bulunmak)
  - [📜 Lisans](#-lisans)

## 🔐 Proje Hakkında

Bu proje, Spring Security ile yetkilendirme ve kimlik doğrulama işlemlerini nasıl uygulayabileceğinizi göstermek için hazırlanmıştır. Aşağıda projenin başlıca özellikleri ve nasıl çalıştırılacağına dair ayrıntılar verilmiştir.

## ⚙️ Özellikler

- Yönetici (ADMIN) ve Kullanıcı (USER) yetkilerine sahip kullanıcılar.
- `/home/**` endpointi yetkilendirilmiştir ve sadece giriş yapmış kullanıcılar tarafından erişilebilir.
- `/alluser` ve `/add` endpointleri tüm kullanıcılara açıktır.
- `/add` endpointi üzerinden yeni kullanıcı veya yönetici eklenebilir.

## 🚀 Nasıl Çalışır?

1. Proje, Spring Boot uygulamasıdır ve uygulamayı başlatmak için Spring Boot'un sağladığı yöntemler kullanılabilir.
2. Kullanıcıların yetkilendirilmesi, Spring Security ile yapılandırılmıştır. Yetkilendirme kurallarının ayarlandığı `SecurityConfig` sınıfına bakabilirsiniz.
3. Kullanıcıların ayrıntıları `UserDetails` sınıfında saklanır. Kullanıcı ayrıntılarının yüklenmesi `UserInfoUserDetailsService` sınıfı tarafından gerçekleştirilir.
4. Yeni bir kullanıcı eklemek için, POST isteği ile `/add` endpointine kullanıcı bilgileri gönderilir. Bu işlemi gerçekleştiren servis `UserService`'dir.

## 🔮 Katkıda Bulunmak

Projenin amacı, Spring Security ile yetkilendirme ve kimlik doğrulamanın nasıl yapılabileceğine dair bir örnek sunmaktır. Bu nedenle, projeye katkıda bulunmak isteyenlerin Spring Security ile ilgili yeni özellikler eklemeye özen göstermeleri tercih edilir.

## 📜 Lisans

Bu proje, MIT Lisansı altında lisanslanmıştır. Projede yer alan tüm kodlar, belgeler ve diğer dosyalar MIT Lisansı altında kullanılabilir.