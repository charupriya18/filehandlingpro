package com.filehandling;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class FileHandling {
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {

		int i = 1;

		while (true) {
			menu();
			System.out.println("enter your choice");
			int c = s.nextInt();

			switch (c) {
			case 1:
				System.out.println("create file");
				create_file();
				break;
			case 2:
				System.out.println("get information of file ");
				FileInfo();
				break;
			case 3:
				System.out.println("write to file");
				write_file();

				break;
			case 4:
				System.out.println("read from file");
				read_file();
				break;

			case 5:
				System.out.println("delete file");
				delete_file();

				break;
			case 6:
				System.out.println("program stopped");
				System.exit(0);
				break;
			default:
				System.out.println("enter valid option");
				break;
			}
		}

	}

	private static void delete_file() {

		File f0 = new File("D:FileOperationExample.txt");
		if (f0.delete()) {
			System.out.println(f0.getName() + " file is deleted successfully.");
		} else {
			System.out.println("Unexpected error found in deletion of the file.");
		}
	}

	private static void read_file() {
		try {
			// Create f1 object of the file to read data
			File f1 = new File("D:FileOperationExample.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(
				"    *****  *  *       ******          *    *      *     **   * ****  *      * **   *  ****      ");
		System.out.println(
				"    *      *  *       *               *    *     * *    * *  * *   * *      * * *  * *          ");
		System.out.println(
				"    *****  *  *       ******          ******    *****   *  * * *   * *      * *  * * *  ****    ");
		System.out.println(
				"    *      *  *       *               *    *   *     *  *   ** *   * *      * *   **  *    *    ");
		System.out.println(
				"    *      *  ******* ******          *    *  *       * *    * ****  ****** * *    *   ****     ");
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println("1. Create File  ");
		System.out.println("2. Get Information of File    ");
		System.out.println("3. Write File  ");
		System.out.println("4. Read from File       ");
		System.out.println("5. Delete File     ");
		System.out.println("6. Stop program     ");

	}

	private static void write_file() {
		try {
			FileWriter fwrite = new FileWriter("D:FileOperationExample.txt");
			fwrite.write("Welcome");
			fwrite.close();
			System.out.println("Content is successfully written in the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
	}

	private static void create_file() {
		// TODO Auto-generated method stub
		try {

			File f0 = new File("D:FileOperationExample.txt");
			if (f0.createNewFile()) {
				System.out.println("File " + f0.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory.");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();
		}
	}

	public static void FileInfo() {

		// Creating file object
		File f0 = new File("D:FileOperationExample.txt");
		if (f0.exists()) {

			System.out.println("The name of the file is: " + f0.getName());
			System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());
			System.out.println("Is file writeable?: " + f0.canWrite());
			System.out.println("Is file readable " + f0.canRead());
			System.out.println("The size of the file in bytes is: " + f0.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}

}