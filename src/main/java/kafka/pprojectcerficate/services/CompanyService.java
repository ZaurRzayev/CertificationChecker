package kafka.pprojectcerficate.services;

import kafka.pprojectcerficate.dtos.CompanyDTO;
import kafka.pprojectcerficate.entities.Company;
import kafka.pprojectcerficate.mappers.CompanyMapper;
import kafka.pprojectcerficate.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapper companyMapper;

    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company company = companyMapper.toEntity(companyDTO);
        company = companyRepository.save(company);
        return companyMapper.toDTO(company);
    }
}

