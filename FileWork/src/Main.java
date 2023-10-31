import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

class Student implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

class MakeUppercase extends FilterReader{
    protected MakeUppercase(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char)c));
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
       int nRead = super.read(cbuf, off, len);
       int last = off + nRead;
       for (int i = off; i < last; i++) {
           cbuf[i] = Character.toUpperCase(cbuf[i]);
       }
       return nRead;
    }
}

public class Main {

    public static void addFolderAndFileInFolder(String folderName, String fileName) {
        try {
            File folder = new File(folderName);

            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File(folder.getAbsolutePath(), fileName + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteFolderAndFileInFolder(String folderName, String fileName) {
        try {
            File folder = new File(folderName);

            if (folder.isDirectory()) {
                File file = new File(folder.getAbsolutePath(), fileName + ".txt");
                if (file.isFile()) {
                    System.out.println("Deleting file: " + file.delete());
                }
                System.out.println("Deleting folder: " + folder.delete());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {

        try {

            File file = new File("parse.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElement = document.createElement("company");
            document.appendChild(rootElement);

            Element staff = document.createElement("staff");
            rootElement.appendChild(staff);

            Attr attr = document.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);

            staff.setAttribute("key", "value");

            Element firstname = document.createElement("firstname");
            firstname.appendChild(document.createTextNode("Ivan"));
            staff.appendChild(firstname);

            Element lastname = document.createElement("lastname");
            firstname.appendChild(document.createTextNode("Ivanov"));
            staff.appendChild(lastname);

            Element nickname = document.createElement("nickname");
            firstname.appendChild(document.createTextNode("Ivo"));
            staff.appendChild(nickname);

            Element salary = document.createElement("salary");
            firstname.appendChild(document.createTextNode("3000"));
            staff.appendChild(salary);

            TransformerFactory tansformerFactory = TransformerFactory.newInstance();
            Transformer transformer = tansformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);

            File file1 = new File("create.xml");
            StreamResult streamResult = new StreamResult(file1);
            transformer.transform(source, streamResult);


            /*File file = new File("parse.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            document.getDocumentElement().normalize();
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

//            NodeList list = document.getDocumentElement().getChildNodes();
            NodeList list = document.getElementsByTagName("staff");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                System.out.println("Element: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Staff id: " + element.getAttribute("id"));
                    System.out.println("firstname: " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("lastname: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("nickname: " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("salary: " + element.getElementsByTagName("salary").item(0).getTextContent());
                }
            }*/



            /*File file = new File("save.sv");
            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            Student student = new Student("Ivan", "Ivanov", 25), restore;

            try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(student);
                objectOutputStream.flush();
            }

            FileInputStream fileInputStream = new FileInputStream(file);
            try(ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                restore = (Student) objectInputStream.readObject();
            }
            System.out.println("Read: " + restore);
            System.out.println("reference: " + (restore == student));
            System.out.println("equals: " + (restore.equals(student)));*/


            /*File folder = new File("test");
            if (!folder.exists()) {
                folder.mkdir();
            }
            if (folder.isDirectory()) {
                System.out.println(folder.getName() + " is a directory");

                File file = new File(folder.getAbsolutePath() + "/test.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                if (file.isFile()) {
                    System.out.println(file.getName() + " is a file");
                }

                File[] files = folder.listFiles();
                for (File f : files) {
                    if (f.isDirectory()) System.out.println(f.getName() + " is a directory");
                    else System.out.println(f.getName() + " is a file");
                    f.delete();
                }
//                file.delete();
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("Text 1\n");
                fileWriter.write("Text 2\n");
                fileWriter.write("Text 3\n");
                fileWriter.write("Text 4\n");
                fileWriter.flush();
                fileWriter.close();

                FileReader fileReader = new FileReader(file);
                char[] text = new char[28];
                while (fileReader.read(text) != -1) {
                    String str = new String(text);
                    System.out.println(str);
                    text = new char[50];
                }
                fileReader.close();

            }
*/
//            folder.delete();


        } catch (Exception ex) {

        }

        /*StringBuilder stringBuilder = new StringBuilder();
        String text = "Hello world!";
        StringReader stringReader = new StringReader(text);
        FilterReader filterReader = new MakeUppercase(stringReader);

        int c;
        while ((c = filterReader.read()) != -1) {
            stringBuilder.append((char)c);
        }
        System.out.println(stringBuilder.toString());*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter folder name: ");
        String folder = scanner.nextLine();
        System.out.print("Enter file name: ");
        String file = scanner.nextLine();
        System.out.print("Enter count: ");
        Integer count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            deleteFolderAndFileInFolder(folder + i, file + i);
//            addFolderAndFileInFolder(folder + i, file + i);
        }*/

        /*try {
            File folder = new File("papka");

            if (folder.exists()) {
                System.out.println("Yes this folder exists");
            } else {
                folder.mkdir();
                System.out.println("Folder created");
            }
            if(folder.isDirectory()) {
                System.out.println("Yes this is a folder");
            } else {
                System.out.println("No this is not a folder");
            }

            File file = new File(folder.getAbsolutePath() + "/test.txt");
            if (file.exists()) {
                System.out.println("Yes this file exists");
            } else {
                file.createNewFile();
                System.out.println("File created");
            }
            if(file.isFile()) {
                System.out.println("Yes this is a file");
            } else {
                System.out.println("No this is not a file");
            }

        } catch (Exception ex) {
        }*/
    }
}