package com.mis.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.domain.ProductVO;
import com.mis.domain.Criteria;
import com.mis.domain.SearchCriteria;

@Repository
public class ProductDAOImpl implements ProductDAO {

   @Inject
   SqlSession sqlSession;

   private static final String namespace = "com.mis.mappers.ProductMapper";

   @Override
   public void create(ProductVO vo) throws Exception {
      sqlSession.insert(namespace + ".create", vo);
   }

   @Override
   public ProductVO read(int bno) throws Exception {
      return sqlSession.selectOne(namespace + ".read", bno);
   }

   @Override
   public void update(ProductVO vo) throws Exception {
      sqlSession.update(namespace + ".update", vo);

   }

   @Override
   public void delete(int bno) throws Exception {
      sqlSession.delete(namespace + ".delete", bno);

   }

//   @Override
//   public List<ProductVO> listAll() throws Exception {
//      return sqlSession.selectList(namespace + ".listAll");
//   }
//
//   @Override
//   public List<ProductVO> listPage(int page) throws Exception {
//      if (page <= 0) {
//
//         page = 1;
//
//      }
//
//      page = (page - 1) * 10;
//
//      return sqlSession.selectList(namespace + ".listPage", page);
//   }
//
//   @Override
//   public List<ProductVO> listCriteria(Criteria cri) throws Exception {
//      return sqlSession.selectList(namespace + ".listPage", cri);
//
//   }

   @Override
   public int countPaging(Criteria cri) throws Exception {
      return sqlSession.selectOne(namespace + ".countPaging", cri);

   }

   @Override
   public List<ProductVO> listSearch(SearchCriteria cri) throws Exception {
      return sqlSession.selectList(namespace + ".listSearch", cri);

   }

   @Override
   public int listSearchCount(SearchCriteria cri) throws Exception {
      return sqlSession.selectOne(namespace + ".listSearchCount", cri);

   }

}