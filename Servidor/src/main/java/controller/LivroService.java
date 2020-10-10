package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import dao.LivroDAO;
import model.Livro;

@WebServlet("/api/livros/*")

/**
 * Servlet implementation class LivroService
 */
public class LivroService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivroService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // GET BY ID
        String pathInfo = request.getPathInfo();
 
        if (pathInfo != null) {
            String[] params = pathInfo.split("/");
 
            if (params.length > 0) {
                Livro livro = LivroDAO.getLivro(Integer.parseInt(params[1]));
 
                if (livro != null) {
                    JSONObject jsonObject = new JSONObject();
 
                    jsonObject.put("id", livro.getId());
                    jsonObject.put("titulo", livro.getTitulo());
                    jsonObject.put("genero", livro.getGenero());
                    jsonObject.put("autor", livro.getAutor());
                    jsonObject.put("sinopse", livro.getSinopse());
                    jsonObject.put("datapublicacao", livro.getDatapublicacao());
                    jsonObject.put("numerototalcapitulos", livro.getNumerototalcapitulos());
 
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().print(jsonObject.toString());
                    response.getWriter().flush();
                } 
                return;
            }
        }
 
        // GET BY NAME
        if (request.getParameter("livro") != null) {
            Livro livro = LivroDAO.getLivroByTitulo(request.getParameter("livro"));
 
            if (livro != null) {
 
                JSONObject jsonObject = new JSONObject();
 
                jsonObject.put("id", livro.getId());
                jsonObject.put("titulo", livro.getTitulo());
                jsonObject.put("genero", livro.getGenero());
                jsonObject.put("autor", livro.getAutor());
                jsonObject.put("sinopse", livro.getSinopse());
                jsonObject.put("datapublicacao", livro.getDatapublicacao());
                jsonObject.put("numerototalcapitulos", livro.getNumerototalcapitulos());

                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().print(jsonObject.toString());
                response.getWriter().flush();
 
            }
            return;
        }
 
        // GET ALL
		
		List<Livro> list = LivroDAO.getAllLivro();
		 
        try {
            JSONArray jArray = new JSONArray();
 
            for (Livro livro : list) {
                JSONObject jsonObject = new JSONObject();
 
                jsonObject.put("id", livro.getId());
                jsonObject.put("titulo", livro.getTitulo());
                jsonObject.put("genero", livro.getGenero());
                jsonObject.put("autor", livro.getAutor());
                jsonObject.put("sinopse", livro.getSinopse());
                jsonObject.put("datapublicacao", livro.getDatapublicacao());
                jsonObject.put("numerototalcapitulos", livro.getNumerototalcapitulos());

                jArray.put(jsonObject);
            }
 
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(jArray.toString());
            response.getWriter().flush();
        } catch (Exception e) {
 
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 StringBuffer jb = new StringBuffer();
	        String line = null;
	        try {
	            BufferedReader reader = request.getReader();
	            while ((line = reader.readLine()) != null)
	                jb.append(line);
	        } catch (Exception e) {
	        }
	 
	        Livro livro = null;
	        JSONObject jsonObject = null;
	 
	        try {
	            // Request
	            jsonObject = new JSONObject(jb.toString());
	            livro = LivroDAO.addLivro(jsonObject.getString("titulo"), jsonObject.getString("genero"), jsonObject.getString("autor"), jsonObject.getString("sinopse"), jsonObject.getString("datapublicacao"), jsonObject.getInt("numerototalcapitulos"));
	 
	            // Response
	            jsonObject.put("id", livro.getId());
                jsonObject.put("titulo", livro.getTitulo());
                jsonObject.put("genero", livro.getGenero());
                jsonObject.put("autor", livro.getAutor());
                jsonObject.put("sinopse", livro.getSinopse());
                jsonObject.put("datapublicacao", livro.getDatapublicacao());
                jsonObject.put("numerototalcapitulos", livro.getNumerototalcapitulos());

	 
	        } catch (JSONException e) {
	        }
	 
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().print(jsonObject.toString());
	        response.getWriter().flush();
	}
	
	 @Override
	    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        // UPDATE BY ID
	        String pathInfo = request.getPathInfo();
	 
	        if (pathInfo != null) {
	            String[] params = pathInfo.split("/");
	 
	            if (params.length > 0) {
	                StringBuffer jb = new StringBuffer();
	                String line = null;
	                try {
	                    BufferedReader reader = request.getReader();
	                    while ((line = reader.readLine()) != null)
	                        jb.append(line);
	                } catch (Exception e) {
	                }
	 
	                Livro livro = null;
	                JSONObject jsonObject = null;
	 
	                try {
	                    // Request
	                    jsonObject = new JSONObject(jb.toString());
	                    livro = LivroDAO.updateLivro(Integer.parseInt(params[1]), jsonObject.getString("titulo"), jsonObject.getString("genero"), jsonObject.getString("autor"), jsonObject.getString("sinopse"), jsonObject.getString("datapublicacao"), jsonObject.getInt("numerototalcapitulos"));
	 
	                    // Response
	                    jsonObject.put("id", livro.getId());
	                    jsonObject.put("titulo", livro.getTitulo());
	                    jsonObject.put("genero", livro.getGenero());
	                    jsonObject.put("autor", livro.getAutor());
	                    jsonObject.put("sinopse", livro.getSinopse());
	                    jsonObject.put("datapublicacao", livro.getDatapublicacao());
	                    jsonObject.put("numerototalcapitulos", livro.getNumerototalcapitulos());
	 
	                } catch (JSONException e) {
	                }
	 
	                response.setContentType("application/json");
	                response.setCharacterEncoding("UTF-8");
	                response.getWriter().print(jsonObject.toString());
	                response.getWriter().flush();
	            }
	        }
	    }
	 
	    @Override
	    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // DELETE BY ID
	        String pathInfo = request.getPathInfo();
	 
	        if (pathInfo != null) {
	            String[] params = pathInfo.split("/");
	 
	            if (params.length > 0) {
	                LivroDAO.deleteLivro(Integer.parseInt(params[1]));
	 
	                response.setContentType("application/json");
	                response.setCharacterEncoding("UTF-8");
	                response.getWriter().flush();
	            }
	        }
	    }
	

    
}
