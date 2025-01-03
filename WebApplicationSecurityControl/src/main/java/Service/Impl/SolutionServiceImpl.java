package Service.Impl;

import Mapper.Impl.SolutionMapper;
import Repository.SolutionRepository;
import Service.SolutionService;
import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService {
    private SolutionRepository repository;
    private SolutionMapper mapper;
}
