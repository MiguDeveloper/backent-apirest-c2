package pe.tuna.backentapirestc2.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpQIBAAKCAQEAtuLWxezjj6taGAV/SA+4tA+sfHhDwJddRILZ2KfB9YyjCeil\n" +
            "h2hjECaYEgdEm2Ft33IlTpm3ru1wP8h9W/o+KY0kZQUzD70/xSxfqDGoeG1MHbpC\n" +
            "LfoV/roNfZSrMdmB+DpTr26QF6TeDbJRKr3KRa8hhlmHwucgMv0SJTd0zlshvXkx\n" +
            "jRZDzIIviVqeg3wDUisLwF26xrv0jyEETj4sN3s/DZlTXaeIsiNlNAJn3mzXjJWU\n" +
            "oapK8MeZxS8qrFHxp0faxJfv9hEf9wxvXshjwU8xOI4KDmruYOibxxIGkmApX5Vp\n" +
            "hGQ8Pa+oMf9DzllYTB1iLPhcvu9DpXu2llMyzQIDAQABAoIBAFSh9LHzRfueWDr1\n" +
            "kElQvTDWcAPJw9DEOy0RQK66M0/mnSxgtPlMnUtEEOuG4YDmPWpB8HHHQPF6f4+E\n" +
            "wD5oN4wS/Nyi41ZNRc2BE2NKV6QjMC4xm56bNMKEZunOesq+1R6CH2f3ykamzPuZ\n" +
            "oWYeHhTRTrpVhDX1rzjpVBRU7YDwcwrQukzgYPSb2WA/gZ7x6ocN6ZHHcHpaXQ7C\n" +
            "ME6KVaH0k9biSzfumDv76IMQYajyi60LNoReylB2N5c/o30wq6f5sLb+U6JaISPG\n" +
            "Off0odl0SShQ9TA+fZMZXLccwEqp+bUXWbg/WqJRhx2qGRrPHu6WnqJU3V8qfdSb\n" +
            "oE+4uSECgYEA28E+kiRrta1Om1+6PgLFpihByJhu2a1ORYgO3KyiofcewT2gJ5Gr\n" +
            "si6SvAThchKwMMBqnKqm1k8VeIOYj4m8PGFldGKj56Q/fEKAWPfi52aX4Ad5Mk6/\n" +
            "oIgAZxAUIOaBuZbAh7s3c0Fl+kIacQq9rqoIgOW1VcLk9MgWChHao7MCgYEA1Qzg\n" +
            "bdz+trtaoI2g5sMhYkmlUtM+eeafhkxtzHY7aXbFPx3qs8e20pNU7YgOWZdvOZuO\n" +
            "ivpHEAVLsF7EXfsuP1zvFuVfHDwX+XvlclLI5/F0gnLWD/1b6L5x5dZyl1fpeXLt\n" +
            "M8TGyv9KnNv2dWYDCKo0pErPsPymMFmAgjdpj38CgYEAzBNYhSUXdZ8dGcM7VK0E\n" +
            "WbqW5K9SegmsX3vruVkEqv6v6+rL2RM5bH49vCeYKXRbdNqr5xO/XdQRb1peCiZx\n" +
            "zWzxZ7TW2543arDjOjvx1sz6i4zFK0fgQzcpkIxo9Oi7Xds2rpXY98qq5k4O+h1s\n" +
            "a1DyFqm7zYnxT7SkavOLpGsCgYEApPUWZBojYerIbd2bAnF9TLPG/M0w54OoanyM\n" +
            "2y2ELNFYQdlxGwf8RyjqLgwVSEsXRFxsTrEgCoh/JS0LD9Vm5oqXWHv6W0swKOxE\n" +
            "KHNuuR/b3RD7K2A5JIkoeRPEn+fijzVr8ZRfc1edNrydJCL7IF9g6QA/tUK5jmAO\n" +
            "P0SWSBMCgYEAjHoVSDtG+Kio8W8IlE9FIPfTs9Q7dnyqBC3XA7MhPMIVm7+/tVPl\n" +
            "YUAnSWw3P5iqMaBNyV6soqU45wdDjOTYuAPhGdk5h81ENHsemHdAuZxZVsxZsMAm\n" +
            "xgV1nJRBNevYZ5QhCJpoxZ3YEPkAbOGbRzh+bccIDsyIFqBp+YrdS7c=\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtuLWxezjj6taGAV/SA+4\n" +
            "tA+sfHhDwJddRILZ2KfB9YyjCeilh2hjECaYEgdEm2Ft33IlTpm3ru1wP8h9W/o+\n" +
            "KY0kZQUzD70/xSxfqDGoeG1MHbpCLfoV/roNfZSrMdmB+DpTr26QF6TeDbJRKr3K\n" +
            "Ra8hhlmHwucgMv0SJTd0zlshvXkxjRZDzIIviVqeg3wDUisLwF26xrv0jyEETj4s\n" +
            "N3s/DZlTXaeIsiNlNAJn3mzXjJWUoapK8MeZxS8qrFHxp0faxJfv9hEf9wxvXshj\n" +
            "wU8xOI4KDmruYOibxxIGkmApX5VphGQ8Pa+oMf9DzllYTB1iLPhcvu9DpXu2llMy\n" +
            "zQIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
