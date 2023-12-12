package jp.ac.ccmc.crud_sample.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import jp.ac.ccmc.crud_sample.model.Department;
// import jp.ac.ccmc.crud_sample.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    // private final DepartmentRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Department department;
        // department = repository.findById(1L).orElse(new Department());
        // department.setName("IT・Web");
        // repository.save(department);

        // department = repository.findById(2L).orElse(new Department());
        // department.setName("AIプロジェクト");
        // repository.save(department);
    }
}