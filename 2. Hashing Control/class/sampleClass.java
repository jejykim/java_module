public class sampleClass {

	public void sampleMethod(String securityParam) {

		HashHelper hashHelper = new HashHelper();

		String hashParam = hashHelper.sha256(securityParam);

		System.out.println("기존 param : " + securityParam);
		System.out.println("hashing param : " + hashParam);
	}
}