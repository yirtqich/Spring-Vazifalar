package com.example.springvazifalar.cotroller;

import com.example.springvazifalar.model.LaptopJPA;
import com.example.springvazifalar.model.Passport;
import com.example.springvazifalar.model.Phone01;
import com.example.springvazifalar.repository.LaptopRepository;
import com.example.springvazifalar.repository.PhoneRepository;
import com.example.springvazifalar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
   @Autowired
   StudentRepository studentRepository;

    @RequestMapping(value = "/Passport",method = RequestMethod.GET)
    public List<Passport> getPassport(){
        List<Passport> passport = studentRepository.findAll();
        return passport;
    }
    @RequestMapping(value = "/Passport",method = RequestMethod.POST)
    public Passport addPassport(@RequestBody Passport passport){
        studentRepository.save(passport);
        return passport;
    }
    @Autowired
    PhoneRepository phoneRepository;
    @RequestMapping(value = "/Phone",method = RequestMethod.GET)
    public List<Phone01> getPhone(){
        List<Phone01> phones = phoneRepository.findAll();
        return phones;
    }
    @RequestMapping(value = "/Phone",method = RequestMethod.POST)
    public Phone01 addPhone(@RequestBody Phone01 phone){
        phoneRepository.save(phone);
        return phone;
    }
    @RequestMapping(value = "/Phone/{id}",method = RequestMethod.DELETE)
    public String deletePhone(@PathVariable Integer id){
        phoneRepository.deleteById(id);
        return "Delete Student";
    }
    @RequestMapping(value = "/Phone/{id}",method = RequestMethod.PUT)
    public String updatePhone(@RequestBody Phone01 phone, @PathVariable Integer id){
        Phone01 phone1 = phoneRepository.findById(id).get();
        if (phone1.getId()==id){
            phone1.setName(phone.getName());
            phone1.setModel(phone.getModel());
            phone1.setMac_address(phone.getMac_address());
            phone1.setInfo(phone.getInfo());
            phoneRepository.save(phone1);

            return "UPDATE PHONE";
        }else {
            return "NOT ERROR";
        }
    }
    @Autowired
    LaptopRepository laptopRepository;

    @RequestMapping(value = "/Laptop",method = RequestMethod.GET)
    public List<LaptopJPA> getLaptop(){
        List<LaptopJPA> laptopJPAS = laptopRepository.findAll();
        return laptopJPAS;
    }
    @RequestMapping(value = "/Laptop",method = RequestMethod.POST)
    public String addLaptop(@RequestBody LaptopJPA laptopJPA){
        laptopRepository.save(laptopJPA);
        return "Save Laptop";
    }
    @RequestMapping(value = "/Laptop/{id}",method = RequestMethod.DELETE)
    public String deleteLaptop(@PathVariable Integer id){
        LaptopJPA laptopJPA = laptopRepository.findById(id).get();
        if (laptopJPA.getId()==id) {
            laptopRepository.deleteById(id);
            return "Delete Laptop";
        }else {
            return "Not Delete";
        }
    }
    @RequestMapping(value = "/Laptop/{id}",method =RequestMethod.PUT )
    public String updateLaptop(@RequestBody LaptopJPA laptop,@PathVariable Integer id) {
        LaptopJPA laptopJPA1 = laptopRepository.findById(id).get();
        if (laptopJPA1.getId() == id) {
            laptopJPA1.setName(laptop.getName());
            laptopJPA1.setRam(laptop.getRam());
            laptopJPA1.setModel(laptop.getModel());
            laptopJPA1.setMac_address(laptop.getMac_address());
            laptopJPA1.setBrand_name(laptop.getBrand_name());
            laptopJPA1.setStorage(laptop.getStorage());
            laptopRepository.save(laptopJPA1);
            return "Update Student";
        }else {
            return "Not Update";
        }

    }


}
