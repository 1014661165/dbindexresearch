package cn.luoyulingfeng.dbindexresearch.data;

import cn.luoyulingfeng.dbindexresearch.mapper.BookReturnRecordMapper;
import cn.luoyulingfeng.dbindexresearch.model.Book;
import cn.luoyulingfeng.dbindexresearch.model.BookReturnRecord;
import cn.luoyulingfeng.dbindexresearch.model.Student;
import cn.luoyulingfeng.dbindexresearch.model.Teacher;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("Duplicates")
public class BookReturnDataGenerator {


    /**
     * 生成图书归还数据
     * @param num
     * @param personList
     */
    @SuppressWarnings("Duplicates")
    public static void generate(int num, List<Object> personList)throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("BookReturnRecords.csv"));
        Random random = new Random();

        long start = System.currentTimeMillis();
        int cnt = 0;
        for (int i=0; i<num; i++){
            cnt++;
            System.out.printf("%.2f%%\n", (cnt*1f / num) * 100);

            BookReturnRecord record = new BookReturnRecord();
            record.setId(i + 1);
            Object person = personList.get(random.nextInt(personList.size()));
            if (person instanceof Student){
                Student student = (Student)person;
                record.setPersonNo(student.getStuNo());
                record.setPersonType(1);
            }else{
                Teacher teacher = (Teacher)person;
                record.setPersonNo(teacher.getTeaNo());
                record.setPersonType(2);
            }
            record.setBookId(random.nextInt(10000000));
            record.setReturnTime(Date.valueOf(String.format("%d-%d-%d", 2000+random.nextInt(20), random.nextInt(12) + 1, random.nextInt(30) + 1)));
            writer.write(record.toString());
            writer.newLine();
        }
        writer.flush();
        writer.close();
        long end = System.currentTimeMillis();
        System.out.printf("time cost: %fs\n", (end - start)/1e3);
    }

    public static void main(String[] args)throws IOException {
        List<Object> personList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("Students.csv"));
        String line = null;
        while ((line = reader.readLine()) != null){
            String[] info = line.split(",");
            int id = Integer.parseInt(info[0]);
            String stuNo = info[1];
            String stuName = info[2];
            int stuGender = Integer.parseInt(info[3]);
            int stuAge = Integer.parseInt(info[4]);
            String stuMajor = info[5];
            int stuType = Integer.parseInt(info[6]);
            int stuGrade = Integer.parseInt(info[7]);
            int stuClass = Integer.parseInt(info[8]);
            Date date = Date.valueOf(info[9]);
            personList.add(new Student(id, stuNo, stuName, stuGender, stuAge, stuMajor, stuType, stuGrade, stuClass, date));
        }
        reader.close();
        reader = new BufferedReader(new FileReader("Teachers.csv"));
        while ((line = reader.readLine()) != null){
            String[] info = line.split(",");
            int id = Integer.parseInt(info[0]);
            String teaNo = info[1];
            String teaName = info[2];
            String teaCollege = info[3];
            personList.add(new Teacher(id, teaNo, teaName, teaCollege));
        }
        reader.close();
        generate(100000, personList);
    }
}
