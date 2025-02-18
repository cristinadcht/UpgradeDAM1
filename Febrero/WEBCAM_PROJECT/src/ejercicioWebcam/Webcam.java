package ejercicioWebcam;

public class Webcam {

    private String resolucion;
    private int fps;
    private boolean encendido;
    private double tamanioImg;

    public Webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;
        this.encendido = false;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getTamanioImg() {
        return tamanioImg;
    }

    public void setTamanioImg(double tamanioImg) {
        this.tamanioImg = tamanioImg;
    }

    public void encender(){
        if (encendido == true){
            System.out.println("La webcam ya está encendida");
        } else {
            encendido = true;
            System.out.println("La webcam se ha encendido");
        }
    }

    public void apagar(){
        if (encendido == false){
            System.out.println("La webcam ya está apagada");
        } else {
            encendido = false;
            System.out.println("La webcam se ha apagado");
        }
    }

    public void tomarFoto (){
        if (encendido == true) {
            int ancho = Integer.parseInt(resolucion.split("x")[0]);
            int alto = Integer.parseInt(resolucion.split("x")[1]);
            tamanioImg = ((ancho * alto * fps)/1000000.0);
            System.out.println("Se ha hecho una foto con resolución " + resolucion + " y el tamaño estimado del archivo ocupa " + tamanioImg + " MB");
        } else {
            System.out.println("La webcam está apagada, no se puede tomar una foto");
        }
    }

    public static void main(String[] args) {
        Webcam miWebcam = new Webcam("1920x1080", 30);

        System.out.println("Intento de foto sin encender la webcam");
        miWebcam.tomarFoto();

        System.out.println("\nEnciendo la webcam y tomo la foto");
        miWebcam.encender();
        miWebcam.tomarFoto();

        System.out.println("\nApago la webcam");
        miWebcam.apagar();
    }
}
