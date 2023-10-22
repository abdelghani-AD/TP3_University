package com.example.firstappkotlin.TP3

class University(var UniversityNom:String , var anneEtude:Int){

    var listeCourse = mutableListOf<Course>()
    var listeProf = mutableListOf<Profeseur>()
    var listeStudents = mutableListOf<Student>()

    fun hire(prof : Profeseur){
        listeProf.add(prof)
        println("prof ${prof.nom} dans L'university ${UniversityNom}")
    }
    fun enroll(student: Student){
        listeStudents.add(student)
        println("student ${student.nomEtud} a été inscrit à l'university ${UniversityNom}.")
    }


    inner class Profeseur(var nom:String , var age:Int ,var salaire:Int){
        fun teach(course: Course){
            listeCourse.add(course)
            println("${nom} prof de  course ${course.CoursNam}")
        }
        fun doOralExam(course: Course, student: Student, note:Int):Boolean{
            if(note<10){
                println("${student.nomEtud} est ${Resulte.echeck} dans l'exame de ${course.CoursNam} , la note est ${note}")
                return false
            }

            println("${student.nomEtud} est ${Resulte.succès}  dans l'exame de ${course.CoursNam} , la note est  ${note}")
            return true
        }
    }
    inner class  Student(var nomEtud:String , var age:Int ,var numMatricule:Int){
        var proba = 50.0/100
        fun enroll(student: Student){
            println("${student.nomEtud} a été inscrire à l'university ${UniversityNom}.")
        }
        fun takExam(str:String ){
            for (i in listeCourse){
                if (str==i.CoursNam){
                    println("${nomEtud} est passer un Exame dans ${i.CoursNam}")
                }
                else{
                    println("${nomEtud} n'est pas passer un Exame dans ${i.CoursNam}")
                }
            }
        }
        fun learn(){
            proba += 2.0/100
            if (proba > 100){
                proba = 100.0
            }
            println("propabilité est ${proba} %")
        }
        fun party(){
            proba -= 2.0/100
            if (proba < 0){
                proba = 0.0
            }
            println("propabilité est ${proba} %")
        }
        fun grade(){
            println(Resulte.succès)
        }
    }
}

data class Course(var CoursNam:String)

enum class Resulte(){
    succès,echeck
}
fun main(){
    var u = University("Hassan-II",1989)
    var p = u.Profeseur("Ossama",35,3500)
    var e = u.Student("amin",19,53468)
    var c = Course("kotlin")
    p.teach(c)
    p.doOralExam(c,e,15)
    u.hire(p)
    e.enroll(e)
    e.takExam("kotlin")
    e.learn()
    e.party()
    e.party()
    e.grade()
    println()

//    var u1 = University("cadi aide",2011)
//    var p1 = u1.Profeseur("Ahmed",30,3000)
//    var e1 = u1.Student("ayoub",20,20030)
//    var c1 = Course("Java")
//    p1.teach(c1)
//    p1.doOralExam(c1,e1,9)
//    e1.enroll(e1)
//    e1.takExam("C++")
//    e1.learn()
//    e1.party()
//    e1.party()
//    println()
}
