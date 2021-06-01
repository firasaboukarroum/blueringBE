package com.backend.Bluering;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.Bluering.entities.Facility;
import com.backend.Bluering.entities.Security;
import com.backend.Bluering.entities.Status;
import com.backend.Bluering.repositories.FacilityRepository;
import com.backend.Bluering.repositories.SecurityRepository;
import com.backend.Bluering.repositories.StatusRepository;

@SpringBootApplication
public class BlueringApplication implements CommandLineRunner{
	@Autowired
	FacilityRepository fac;
	@Autowired
	StatusRepository stat;
	@Autowired
	SecurityRepository sec;
	
	public static void main(String[] args) {
		SpringApplication.run(BlueringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		
//		Status sta =new Status("ACTIVE","green");
//		Status sta2 =new Status("DRAFT","yellow");
//		Security secu1=new Security("Cash Collateral", "Amount 1,200,000 USD", 200000, 34934, 0, 0);
//		Security secu2=new Security("Registered 1st Degree Mortage", "Amount 1,200,000 USD", 344000, 4000, 0, 0);
//		Security secu3=new Security("Assihgnment of Private Amount", "Amount 1,200,000 USD", 0, 0, 344000.43, 344000.43);
//		Facility fa=new Facility("Meduim & Long Term Loan", "USD -10.5% Interest", 200000, 344000, 100000, 0, "Commercial Vontractor", "variable", 2, null, 9.55, "Annually", 10, "10.05", 3.00, "from the normal Course of business", "financing project","from balloon payment, upon maturity", 6, null, "monthly", "Lebanon");
//		
//		Facility fa2=new Facility("Meduim & Long Term Loan", "USD -10.5% Interest", 100000, 544000, 100000, 0, "Commercial Vontractor", "constant", 2, null, 20, "monthly", 10, "10.05", 3.00, "from the normal Course of business", "financing project","from balloon payment, upon maturity", 6, null, "monthly", "Lebanon");
//		Facility fa3=new Facility("Credit Card Request", "USD -10.5% Interest", 100000, 544000, 100000, 0, "Commercial Vontractor", "variable", 2, null, 10, "Annually", 10, "10.05", 3.00, "from the normal Course of business", "financing project","from balloon payment, upon maturity", 6, null, "monthly", "Lebanon");
//		
//		fa.setStatus(sta);
//		fa2.setStatus(sta);
//		fa3.setStatus(sta2);
//		List<Security> securities= new ArrayList<Security>();
//		securities.add(secu1);
//		securities.add(secu2);
//		securities.add(secu3);
//		fa.setSecurities(securities);
//		fa2.setSecurities(securities);
//		fa3.setSecurities(securities);
//		stat.save(sta);
//		stat.save(sta2);
//		sec.save(secu1);
//		sec.save(secu2);
//		sec.save(secu3);
//		fac.save(fa);
//		fac.save(fa2);
//		fac.save(fa3);
		
		
		
	}

}
