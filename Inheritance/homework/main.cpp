#include <iostream>
#include "person.h"
#include "student.h"
#include "teacher.h"

using namespace std;


int main()
{
    Student st1 = Student(); 
    st1.setName("Ahmet");
    st1.setClassRoom("3B");
    st1.setStudentNumber("3456");
    st1.setAge(12);

    std::cout << st1.toString() << std::endl;

    Teacher tc1 = Teacher(); 
    tc1.setName("Orhan");
    tc1.setAge(32);
    tc1.setBranches("Türkçe");
    tc1.setBranches("Sosyal Bilgiler");
    tc1.setBranches("Matematik");
    
    std::cout << "\nBranches: " << std::endl;
    for (auto &&i : tc1.getBranches())
    {
        std::cout << i << std::endl;
    }
    std::cout << "\n " << std::endl;


    std::cout << tc1.toString() << std::endl;
    char c = getchar();
    return 0;
};
