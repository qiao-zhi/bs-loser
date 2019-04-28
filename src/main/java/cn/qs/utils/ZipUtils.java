package cn.qs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.io.IOUtils;

public class ZipUtils {

	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		doUnzipTarfile();
	}

	/**
	 * 解压缩tar文件
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void doUnzipTarfile() throws FileNotFoundException, IOException {
		TarArchiveInputStream inputStream = new TarArchiveInputStream(new FileInputStream("G:/unzip/ttt.tar"));
		ArchiveEntry archiveEntry = null;
		while ((archiveEntry = inputStream.getNextEntry()) != null) {
			// h文件名称
			String name = archiveEntry.getName();
			// 构造解压出来的文件存放路径
			String entryFilePath = "G:/unzip/" + name;
			// 读取内容
			byte[] content = new byte[(int) archiveEntry.getSize()];
			inputStream.read(content);
			// 内容拷贝
			IOUtils.copy(inputStream, new FileOutputStream(entryFilePath));
		}

		IOUtils.closeQuietly(inputStream);
	}

	/**
	 * 解压缩zip文件
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void doUnzipZipfile() throws FileNotFoundException, IOException {
		ZipArchiveInputStream inputStream = new ZipArchiveInputStream(new FileInputStream("G:/unzip/ttt.zip"));
		ArchiveEntry archiveEntry = null;
		while ((archiveEntry = inputStream.getNextEntry()) != null) {
			// h文件名称
			String name = archiveEntry.getName();
			// 构造解压出来的文件存放路径
			String entryFilePath = "G:/unzip/" + name;
			// 读取内容
			byte[] content = new byte[(int) archiveEntry.getSize()];
			inputStream.read(content);
			// 内容拷贝
			IOUtils.copy(inputStream, new FileOutputStream(entryFilePath));
		}

		IOUtils.closeQuietly(inputStream);
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
		FileInputStream fileInputStream = new FileInputStream(new File("G:/unzip/blank.pdf"));
		IOUtils.copyLarge(fileInputStream, zipOutput);
		IOUtils.closeQuietly(fileInputStream);
		zipOutput.closeArchiveEntry();

		// 压第二个文件
		ZipArchiveEntry entry1 = new ZipArchiveEntry("killTomcat.bat");
		zipOutput.putArchiveEntry(entry1);
		FileInputStream fileInputStream1 = new FileInputStream(new File("G:/unzip/springboot.log"));
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
		File file = new File("G:/unzip/ttt.pdf");
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
