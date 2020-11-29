public class Main {
    public static void main(String[] args) {
        //test case 1: 50 luồng: con trỏ duyệt loop 50 lần nhanh hơn nên các luồng đc tạo 1 lượt trước khi luồng chạy
        //test case 2: 5000 luồng: sự khác biệt rõ ràng khi con trỏ giờ phải đáp ứng nhu cầu tạo số lượng luồng lớn
        for(int i=0; i<10; i++){
            String newThreadName = String.valueOf(i);
            NewThread newThread = new NewThread(newThreadName);
        }

    }
}
