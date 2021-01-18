package cz.czechitas.webapp.persistence;

import java.util.*;
import org.springframework.stereotype.*;
import cz.czechitas.webapp.entity.*;

public interface PexesoRepository {

    HerniPlocha findById(Long id);

    HerniPlocha save(HerniPlocha plocha);
}
