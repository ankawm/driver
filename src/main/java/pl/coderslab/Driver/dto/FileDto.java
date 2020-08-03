package pl.coderslab.Driver.dto;


public class FileDto {
    private Long id;
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private Long size;



    public FileDto(long id, String fileName, String fileDownloadUri, String fileType, long size) {
        this.id =id;
        this.fileName = fileName;
        //zmienic na URL w advice dto
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    public FileDto() {
    }

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public Long getSize() {
        return size;
    }

    public static class Builder {
        private FileDto fileDto = new FileDto();

        public FileDto.Builder withId(Long id) {
            fileDto.id = id;
            return this;
        }
        public FileDto.Builder withFileName(String fileName) {
            fileDto.fileName = fileName;
            return this;
        }
        public FileDto.Builder withFileDownloadUri(String fileDownloadUri) {
            fileDto.fileDownloadUri = fileDownloadUri;
            return this;
        }
        public FileDto.Builder withFileType(String fileType) {
            fileDto.fileType = fileType;
            return this;
        }

        public FileDto.Builder withSize(Long size) {
            fileDto.size = size;
            return this;
        }
        public FileDto build(){
            return fileDto;
        }
    }

}
