package school.lesson7;

public class AppData {
    private String[] header;
    private int[][] data;
    private String out = "";

    public AppData(String[] header) {
        this.header = header;
    }

    public AppData(int[][] data) {
        this.data = data;
    }

    public String writeHeader(){

        for(String x : header)
            out += x +";";
        return out;
    }

    public String writeData(){
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j <data[i].length;j++){
                if(j == data[i].length-1){
                    out += data[i][j] +";"+"\n";
                }else{
                    out += data[i][j] +";";
                }
            }
        }
        return out;
    }
}
