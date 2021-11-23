package com.bank.transactions.code;

        import com.bank.transactions.code.Tmodel;
        import com.bank.transactions.code.Trepository;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class Tservice {

    private final Trepository repo;

    public Tservice(Trepository repository) {
        this.repo = repository;
    }

    public List<Tmodel> get(String ID) {
//        Tmodel response=repo.findById(ID).orElse(null);
        List<Tmodel> response= repo.findByAccountnumber(ID);
        System.out.println(response);
        return response;
    }


    public Tmodel create(Tmodel tr) {
        return repo.save(tr);
    }
}