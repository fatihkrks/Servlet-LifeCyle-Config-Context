package handleRequest;

public class Notes {

	
	
	   
}
//HandleRequest
	//1>son kullanıcı servleti çağıran bir url e tıklar
	//2>container gelen isteğe karşılık iki obje oluşturur (request,response)
	//3>Container yeni bir thread oluşturur.service metodunu çağırır(Servlet sınıfı içinde service)
	// 2.adımda oluşan objeler bu metoda geçer 
	//4>gelen istek bir get ise doget e bir post isteği iste dopost a yönlendirilir
//5>ilgili metod çalışır .istek karşılanır
//6>service metodu sonlanır .thread sonlanır. request ve response objeleri garbage collector tarafından temizlenebilir .
