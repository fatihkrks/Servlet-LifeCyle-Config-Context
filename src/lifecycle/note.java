package lifecycle;

public class note {

}

//Lifecycle
//1>container,servlet class dosyalarını bulur 
// sonrasında loading işlemi yapar
//servletler 
//1-public olmak zorundadır
//2-public no org contsructor olmak zorundadır
//3-genel olarak servletlerde constructor tanımlanma
//4-constructor yerine init metodu tercih edilir 
 

//2-servlet initialize
//proje ayağa kalkarken,istek karşılanmadan önce,ilgili servlet ilk defa çalışmadan önce vs
//bir konfigrasyon yapmak isteriz,bu mantığa initiazi mantığı denir.
//init metodu lifecycle boyunca bir kez çalışır

//3-servicing
//servlet objesi oluştu
//servlet initialize oldu
//bu noktadan sonra artık istekler karşılanabilir (handle request)
//service metodu override etme
//gelen her isteğe karşılık bir thread oluşur
//her servlet için bir tane instance oluşur
//her istek için bir thread/bir obje 
//4-do get do post çalışır
