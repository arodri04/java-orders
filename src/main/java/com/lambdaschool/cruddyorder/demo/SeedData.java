package com.lambdaschool.cruddyorder.demo;

import com.lambdaschool.cruddyorder.demo.model.Agents;
import com.lambdaschool.cruddyorder.demo.model.Customer;
import com.lambdaschool.cruddyorder.demo.repos.AgentRepository;
import com.lambdaschool.cruddyorder.demo.repos.CustomerRepository;
import com.lambdaschool.cruddyorder.demo.service.AgentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{

    private CustomerRepository custrepos;
    private AgentRepository agentrepos;



    public SeedData(CustomerRepository custrepos, AgentRepository agentrepos)
    {
        this.custrepos = custrepos;
        this.agentrepos = agentrepos;

    }

    @Override
    public void run(String[] args) throws Exception
    {
        Agents a01 = new Agents("Ramasundar", "Bangalore", 0.15, "077-25814763", "");
        Agents a02 = new Agents("Alex ", "London", 0.13, "075-12458969", "");
        Agents a03 = new Agents("Alford", "New York", 0.12, "044-25874365", "");
        Agents a04 = new Agents("Ravi Kumar", "Bangalore", 0.15, "077-45625874", "");
        Agents a05 = new Agents("Santakumar", "Chennai", 0.14, "007-22388644", "");
        Agents a06 = new Agents("Lucida", "San Jose", 0.12, "044-52981425", "");
        Agents a07 = new Agents("Anderson", "Brisban", 0.13, "045-21447739", "");
        Agents a08 = new Agents("Subbarao", "Bangalore", 0.14, "077-12346674", "");
        Agents a09 = new Agents("Mukesh", "Mumbai", 0.11, "029-12358964", "");
        Agents a10 = new Agents("McDen", "London", 0.15, "078-22255588", "");
        Agents a11 = new Agents("Ivan", "Torento", 0.15, "008-22544166", "");
        Agents a12 = new Agents("Benjamin", "Hampshair", 0.11, "008-22536178", "");

        Customer c01 = new Customer("Holmes", "London", "London", "UK", "2", 6000.00, 5000.00, 7000.00, 4000.00, "BBBBBBB", a03);
        Customer c02 = new Customer("Micheal", "New York", "New York", "USA", "2", 3000.00, 5000.00, 2000.00, 6000.00, "CCCCCCC", a08);
        Customer c03 = new Customer("Albert", "New York", "New York", "USA", "3", 5000.00, 7000.00, 6000.00, 6000.00, "BBBBSBB", a08);
        Customer c04 = new Customer("Ravindran", "Bangalore", "Bangalore", "India", "2", 5000.00, 7000.00, 4000.00, 8000.00, "AVAVAVA", a08);
        Customer c05 = new Customer("Cook", "London", "London", "UK", "2", 4000.00, 9000.00, 7000.00, 6000.00, "FSDDSDF", a06);
        Customer c06 = new Customer("Stuart", "London", "London", "UK", "1", 6000.00, 8000.00, 3000.00, 11000.00, "GFSGERS", a03);
        Customer c07 = new Customer("Bolt", "New York", "New York", "USA", "3", 5000.00, 7000.00, 9000.00, 3000.00, "DDNRDRH", a08);
        Customer c08 = new Customer("Fleming", "Brisban", "Brisban", "Australia", "2", 7000.00, 7000.00, 9000.00, 5000.00, "NHBGVFC", a05);
        Customer c09 = new Customer("Jacks", "Brisban", "Brisban", "Australia", "1", 7000.00, 7000.00, 7000.00, 7000.00, "WERTGDF", a05);
        Customer c10 = new Customer("Yearannaidu", "Chennai", "Chennai", "India", "1", 8000.00, 7000.00, 7000.00, 8000.00, "ZZZZBFV", a10);
        Customer c11 = new Customer("Sasikant", "Mumbai", "Mumbai", "India", "1", 7000.00, 11000.00, 7000.00, 11000.00, "147-25896312", a02);
        Customer c12 = new Customer("Ramanathan", "Chennai", "Chennai", "India", "1", 7000.00, 11000.00, 9000.00, 9000.00, "GHRDWSD", a10);
        Customer c13 = new Customer("Avinash", "Mumbai", "Mumbai", "India", "2", 7000.00, 11000.00, 9000.00, 9000.00, "113-12345678",a02);
        Customer c14 = new Customer("Winston", "Brisban", "Brisban", "Australia", "1", 5000.00, 8000.00, 7000.00, 6000.00, "AAAAAAA", a05);
        Customer c15 = new Customer("Karl", "London", "London", "UK", "0", 4000.00, 6000.00, 7000.00, 3000.00, "AAAABAA", a06);
        Customer c16 = new Customer("Shilton", "Torento", "Torento", "Canada", "1", 10000.00, 7000.00, 6000.00, 11000.00, "DDDDDDD", a04);
        Customer c17 = new Customer("Charles", "Hampshair", "Hampshair", "UK", "3", 6000.00, 4000.00, 5000.00, 5000.00, "MMMMMMM", a09);
        Customer c18 = new Customer("Srinivas", "Bangalore", "Bangalore", "India", "2", 8000.00, 4000.00, 3000.00, 9000.00, "AAAAAAB", a07);
        Customer c19 = new Customer("Steven", "San Jose", "San Jose", "USA", "1", 5000.00, 7000.00, 9000.00, 3000.00, "KRFYGJK", a12);
        Customer c20 = new Customer("Karolina", "Torento", "Torento", "Canada", "1", 7000.00, 7000.00, 9000.00, 5000.00, "HJKORED", a04);
        Customer c21 = new Customer("Martin", "Torento", "Torento", "Canada", "2", 8000.00, 7000.00, 7000.00, 8000.00, "MJYURFD", a04);
        Customer c22 = new Customer("Ramesh", "Mumbai", "Mumbai", "India", "3", 8000.00, 7000.00, 3000.00, 12000.00, "Phone No", a02);
        Customer c23 = new Customer("Rangarappa", "Bangalore", "Bangalore", "India", "2", 8000.00, 11000.00, 7000.00, 12000.00, "AAAATGF", a01);
        Customer c24 = new Customer("Venkatpati", "Bangalore", "Bangalore", "India", "2", 8000.00, 11000.00, 7000.00, 12000.00, "JRTVFDD", a07);
        Customer c25 = new Customer("Sundariya", "Chennai", "Chennai", "India", "3", 7000.00, 11000.00, 7000.00, 11000.00, "PPHGRTS", a10);
    }

        agentrepos.save(a01);
        agentrepos.save(a02);
        agentrepos.save(a03);
        agentrepos.save(a04);
        agentrepos.save(a05);
        agentrepos.save(a06);
        agentrepos.save(a07);
        agentrepos.save(a08);
        agentrepos.save(a09);
        agentrepos.save(a10);
        agentrepos.save(a11);
        agentrepos.save(a12);

        custrepos.save(c01);
        custrepos.save(c02);
        custrepos.save(c03);
        custrepos.save(c04);
        custrepos.save(c05);
        custrepos.save(c06);
        custrepos.save(c07);
        custrepos.save(c08);
        custrepos.save(c09);
        custrepos.save(c10);
        custrepos.save(c11);
        custrepos.save(c12);
        custrepos.save(c13);
        custrepos.save(c14);
        custrepos.save(c15);
        custrepos.save(c16);
        custrepos.save(c17);
        custrepos.save(c18);
        custrepos.save(c19);
        custrepos.save(c20);
        custrepos.save(c21);
        custrepos.save(c22);
        custrepos.save(c23);
        custrepos.save(c24);
        custrepos.save(c25);

}
