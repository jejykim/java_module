public class sampleClass {

	public void sampleMethod(String securityParam) {

		HashHelper hashHelper = new HashHelper();

		// 기본 hashing
		String hashParam = hashHelper.sha256(securityParam);

		// salt + hashing
		String salt = hashHelper.makeSalt(); // 해당 salt가 지속적으로 사용될 경우 DB에 컬럼 추가하여 저장
		String saltHashParam = hashHelper.sha256(securityParam+salt);

		System.out.println("기존 param : " + securityParam);
		System.out.println("hashing param : " + hashParam);
		System.out.println("salt + hashing param : " + saltHashParam);
	}
}