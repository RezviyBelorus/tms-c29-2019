package tms.c29.lec_16.classwork.point_3;

public class StringChanger {
    private StringBuilder stringBuilder = new StringBuilder();

    private StringBuffer stringBuffer = new StringBuffer();

    private String name = "";

    public void addStringSpace() {
        name = name + " ";
    }

    public void addBuilderSpace() {
        stringBuilder.append(" ");
    }

    public void addBufferSpace() {
        stringBuffer.append(" ");
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public String getName() {
        return name;
    }
}
