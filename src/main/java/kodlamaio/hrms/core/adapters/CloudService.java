package kodlamaio.hrms.core.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;

public interface CloudService {
	DataResult<Map<String, String>> upload(MultipartFile multipartFile);
    @SuppressWarnings("rawtypes")
	DataResult<Map> delete(Object public_id) throws IOException;
}
