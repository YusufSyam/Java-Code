import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenampilkanWaktu {
	public static void main(String [] args) {
		DateFormat formatTanggal= new SimpleDateFormat("yyyy/MM/dd");
		DateFormat formatTanggal3= new SimpleDateFormat("yyyy/MM/dd");
		DateFormat formatTanggal2= new SimpleDateFormat("dd");
		DateFormat formatWaktu= new SimpleDateFormat("HH:mm");
		
		Date date= new Date();
		
		System.out.println(formatTanggal.format(date));
		System.out.println(formatTanggal2.format(date));
		System.out.println(formatWaktu.format(date));
		
		Calendar cal= Calendar.getInstance();
		int res= cal.getActualMaximum(Calendar.DATE);
		System.out.println(res);
		
		System.out.println("TANGGAL SAAT INI:");
		System.out.println("TAHUN:"+Integer.parseInt(formatTanggal.format(date).substring(0, 4)));
		System.out.println("BULAN:"+formatTanggal.format(date).substring(5, 7));
		System.out.println("HARI:"+formatTanggal.format(date).substring(8));
	}
}
