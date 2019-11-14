package ejercicioCuil;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class LeerArchivo {
	private static final int OBJMAX = 20;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "/Users/pablo/Desktop/POOI/Cuils.txt";
		String newFileName = "/Users/pablo/Desktop/POOI/CuilsOut.txt";

//		File textFile = new File(fileName);

		Scanner in = new Scanner(new File (fileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName));


		Cuil obj [] = new Cuil[OBJMAX];

		String value = in.next();
		System.out.println(value);

		in.nextLine();

		int cont = 0;

		while(in.hasNextLine()){
			String prefijo;
			String documento;
			int cod_ver;

			String nextvalue = in.nextLine();
			prefijo = nextvalue.substring(0,2);
			documento = nextvalue.substring(2,10);
			cod_ver = Integer.valueOf(nextvalue.substring(10,11));			
			obj[cont] = new Cuil(prefijo, documento, cod_ver);
			cont++;
		}
		for(int i = 0; i < cont ; i ++) {
			//			String line;
			bw.write("" +obj[i]+"");
			bw.newLine();
			bw.write("" + obj[i].isCuil() + "");
			bw.newLine();
			//			System.out.println(obj[i]);
			//			obj[i].isCuil();
		}
		//		System.out.println(cont);
		in.close();
		bw.close();
	}

}