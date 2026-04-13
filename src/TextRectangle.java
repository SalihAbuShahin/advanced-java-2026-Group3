public class TextRectangle extends Rectangle {

    private String text;

    public TextRectangle(double length, double width, String text) {
        super(length, width);
        this.text = text;
    }

    public TextRectangle(double size, String text){
        super(size);
        this.text = text;
    }

    public TextRectangle(String text){
        super();
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display(){
        super.display();
        System.out.println(":" + text);
    }

    public boolean equals(Object o){
        if(!(o instanceof TextRectangle))
            return false;
        TextRectangle r = (TextRectangle) o;
        return super.equals(r)&&text.equals(r.text);
    }
    public int hashCode(){
        return super.hashCode()*31 + text.hashCode();
    }
}
