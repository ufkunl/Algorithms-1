"# Algorithms-1" 

Bu sorudan iki anlam çıkardım bundan dolayı ikisi içinde çözüm geliştirdim. (ilk çözümü yorum satırı yaptım)

1- İlk olarak soruda farklı permutasyonlarının diğer text içerisinde bulunmasını okuduğumda bir textin harflerinin yerleri kaç kere değişebilirse o kadar kombinlerinin
diğer text içerisinde bulunup bulunmaması olarak algıladım.

abc => abc,acb,bac,bca,cab,cba 

Aldığım text'en hangi kombinlerin çıkacağını hesapladım ve bunları biz diziye aldım. Dizinin boyutu için de olasılık dersinde eleman sayısına göre permütasyonunu bulma formülünü kullandım.

Her bir sıralamanın diğer text içerisinde bulunup bulunmaması şeklinde kontrol yaptım.

Bir fonksiyon bir işi yapar mantığı ile okunur bir kod yazmaya çalıştım.


2- Diğer bir çıkardığım anlam bir text içindeki harflerin diğer text içindeki kontrolü ydü. Bunun için bir texti loop ile dönerek diğer text içindeki kontrolünü yaptım.

baba => abab  true
baba => abc  false
lds => lodoos  true

Bu örnekler içerisinde 3.olanı hala anlamadım. lds deki harfler lodoos içerisinde var ama lodoos da 'o' harfi lds içerisinde bulunmuyor. Ama true dönmesi istenmiş.
Eğer birinin olması yetiyorsa 2.olan da ilkinde ki bütün harflar ikinci textte bulunmaktadır.

Kullandığım Dil
- JAVA

Kullandığım IDE
- Intellij IDEA
