package edu.common;

/**
 * 返回结果对象
 *
 * @param <T>
 */
public class ResponseDTO<T> {
    /**
     * 1:成功
     * 1002:服务器内容错误
     */
    private int state;
    private String message;
    private T content;

    public ResponseDTO() {
    }

    public ResponseDTO(int state, String message, T content) {
        this.state = state;
        this.message = message;
        this.content = content;
    }

    public static <T> ResponseDTO<T> response(int state, String message) {
        return response(state, message, null);
    }

    /**
     * @param state   状态码
     * @param message 提示信息
     * @param content 返回数据
     * @param <T>     类型T
     * @return <T> ResponseDTO
     */
    public static <T> ResponseDTO<T> response(int state, String message, T content) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setState(state);
        responseDTO.setContent(content);
        responseDTO.setMessage(message);
        return responseDTO;
    }

    public static <T> ResponseDTO<T> success() {
        return ResponseDTO.response(1, "success", null);
    }

    public static <T> ResponseDTO<T> success(T content) {
        return ResponseDTO.response(1, "success", content);
    }

    public static <T> ResponseDTO<T> ofError(int state, String message, T content) {
        return ResponseDTO.response(state, message, content);
    }

    public static <T> ResponseDTO<T> ofError(int state, String message) {
        return ResponseDTO.response(state, message, null);
    }

    public static <T> ResponseDTO<T> ofError(String message) {
        return ResponseDTO.response(1002, message, null);
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContent(T content) {
        this.content = content;
    }
}