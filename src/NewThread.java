public class NewThread implements Runnable{
    public String name;
    public Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + name);
        t.start();
    }

    public void run(){
        System.out.println("Thread " + name + " is running...");
        while(true){
        }
    }
    //While true de thread luon chay

    // Tại sao thread sau khi được tạo không start luôn mà phải đợi tạo hết các thread mới start(trong trường hợp của bài 50 luồng)???
    // ->> tốc độ của con trỏ chạy qua các luồng (trong trường hợp 50 luồng - khá bé, thử tăng số lượng thread lên > 500 sẽ thấy rõ)
    // https://voer.edu.vn/c/luong/a22667db/766d6175
}
