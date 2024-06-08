package kafka.pprojectcerficate.mappers;


import kafka.pprojectcerficate.dtos.CompanyDTO;
import kafka.pprojectcerficate.entities.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    Company toEntity(CompanyDTO companyDTO);
    CompanyDTO toDTO(Company company);
}

