package cn.qs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.io.IOUtils;

public class ZipUtils {

	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		doCompressTar();
	}

	/**
	 * 压缩zip
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void doCompressZip() throws IOException, FileNotFoundException {
		ZipArchiveOutputStream zipOutput = new ZipArchiveOutputStream(new File("G:/unzip/ttt.zip"));
		zipOutput.setEncoding("GBK");
		zipOutput.setUseZip64(Zip64Mode.AsNeeded);
		zipOutput.setMethod(ZipArchiveOutputStream.STORED);

		// 压一个文件
		ZipArchiveEntry entry = new ZipArchiveEntry("ttt.pdf");
		zipOutput.putArchiveEntry(entry);
		FileInputStream fileInputStream = new FileInputStream(new File("G:/unzip/档案库房管理.pdf"));
		IOUtils.copyLarge(fileInputStream, zipOutput);
		IOUtils.closeQuietly(fileInputStream);
		zipOutput.closeArchiveEntry();

		// 压第二个文件
		ZipArchiveEntry entry1 = new ZipArchiveEntry("killTomcat.bat");
		zipOutput.putArchiveEntry(entry1);
		FileInputStream fileInputStream1 = new FileInputStream(new File("G:/unzip/killTomcat.bat"));
		IOUtils.copyLarge(fileInputStream1, zipOutput);
		IOUtils.closeQuietly(fileInputStream1);
		zipOutput.closeArchiveEntry();

		IOUtils.closeQuietly(zipOutput);
	}

	/**
	 * 压缩tar
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void doCompressTar() throws IOException, FileNotFoundException {
		TarArchiveOutputStream tarOut = new TarArchiveOutputStream(new FileOutputStream("G:/unzip/ttt.tar"));

		// 压一个文件
		TarArchiveEntry entry = new TarArchiveEntry("ttt.pdf");
		File file = new File("G:/unzip/档案库房管理.pdf");
		entry.setSize(file.length());
		tarOut.putArchiveEntry(entry);
		FileInputStream fileInputStream = new FileInputStream(file);
		IOUtils.copyLarge(fileInputStream, tarOut);
		IOUtils.closeQuietly(fileInputStream);
		tarOut.closeArchiveEntry();

		// 压第二个文件
		TarArchiveEntry entry1 = new TarArchiveEntry("killTomcat.bat");
		File file2 = new File("G:/unzip/killTomcat.bat");
		entry1.setSize(file2.length());
		tarOut.putArchiveEntry(entry1);
		FileInputStream fileInputStream1 = new FileInputStream(file2);
		IOUtils.copyLarge(fileInputStream1, tarOut);
		IOUtils.closeQuietly(fileInputStream1);
		tarOut.closeArchiveEntry();

		IOUtils.closeQuietly(tarOut);
	}
}
