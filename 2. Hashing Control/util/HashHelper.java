public class HashParameter {

	 /**
     * SHA-256으로 해싱하는 메소드
     * 
     * @param bytes
     * @return
     * @throws NoSuchAlgorithmException 
     */
    public String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(SettingManagement.getSalt().getBytes());
        md.update(msg.getBytes());
        
        return bytesToHex(md.digest());
    }
    
    /**
     * SHA-512으로 해싱하는 메소드
     * 
     * @param bytes
     * @return
     * @throws NoSuchAlgorithmException 
     */
    public String sha512(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(SettingManagement.getSalt().getBytes());
        md.update(msg.getBytes());
        
        return bytesToHex(md.digest());
    }
    
    /**
     * 바이트를 헥스값으로 변환한다
     * 
     * @param bytes
     * @return
     */
    public String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes) {
          builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

    /**
     * salt 값을 변환한다
     * 
     * @param 
     * @return String
     */
    public String makeSalt() {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return new String(Base64.getEncoder().encode(bytes));
    }
    
}
