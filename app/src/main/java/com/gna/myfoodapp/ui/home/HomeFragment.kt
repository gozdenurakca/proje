package com.gna.myfoodapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gna.myfoodapp.R
import com.gna.myfoodapp.adapters.HomeHorAdapter
import com.gna.myfoodapp.models.HomeHorModels


abstract class HomeFragment : Fragment() {

    private lateinit var homeHorizontalRec: RecyclerView
    private lateinit var homeHorModelList: ArrayList<HomeHorModels>
    private lateinit var homeHorAdapter: HomeHorAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec)

        // Horizontal RecyclerView
        homeHorModelList = ArrayList()
        homeHorModelList.add(HomeHorModels(R.drawable.pizza, "Pizza"))
        homeHorModelList.add(HomeHorModels(R.drawable.hamburger, "HamBurger"))
        homeHorModelList.add(HomeHorModels(R.drawable.makarna, "Pasta"))
        homeHorModelList.add(HomeHorModels(R.drawable.lahmacun, "Lahmacun"))
        homeHorModelList.add(HomeHorModels(R.drawable.kofte, "MeatBall"))

        homeHorAdapter = HomeHorAdapter(this, requireActivity(), homeHorModelList)
        homeHorizontalRec.adapter = homeHorAdapter
        homeHorizontalRec.layoutManager =
            LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.isNestedScrollingEnabled = (false)
        return TODO("Provide the return value")
    }
}



 /*
class HomeFragment<FragmentActivity> : Fragment() {

    private lateinit var homeHorizontalRec: RecyclerView
    private lateinit var homeVerticalRec: RecyclerView
    private lateinit var homeHorModelList: MutableList<HomeHorModels>
    private lateinit var homeHorAdapter: HomeHorAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec)
        homeVerticalRec = root.findViewById(R.id.home_ver_rec)


        homeHorModelList = mutableListOf()
        homeHorModelList.add(HomeHorModels(R.drawable.pizza, "Pizza"))
        homeHorModelList.add(HomeHorModels(R.drawable.hamburger, "Hamburger"))
        homeHorModelList.add(HomeHorModels(R.drawable.makarna, "Pasta"))
        homeHorModelList.add(HomeHorModels(R.drawable.lahmacun, "Lahmacun"))
        homeHorModelList.add(HomeHorModels(R.drawable.kofte, "Meatball"))
        homeHorModelList.add(HomeHorModels(R.drawable.kruvasan, "Croissant"))
        homeHorModelList.add(HomeHorModels(R.drawable.kek, "Cake"))
        homeHorModelList.add(HomeHorModels(R.drawable.salata, "Salad"))
        homeHorModelList.add(HomeHorModels(R.drawable.balik, "Fish"))
        homeHorModelList.add(HomeHorModels(R.drawable.kisir, "Kısır"))
        homeHorModelList.add(HomeHorModels(R.drawable.lasagna, "Lasagna"))
        homeHorModelList.add(HomeHorModels(R.drawable.corba, "Soup"))

        homeHorAdapter = HomeHorAdapter(requireActivity(), homeHorModelList)
        homeHorizontalRec.adapter = homeHorAdapter
        homeHorizontalRec.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        homeHorizontalRec.setHasFixedSize(true)
        homeHorizontalRec.isNestedScrollingEnabled = false

        return root
    }

}
*/

/* JAVA

public class HomeFragment extends Fragment implements UpdateVerticalRec {


    RecyclerView homeHorizontalRect,homeVerticalRec;
    ArrayList<HomeHorModels> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    // Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        // Horizontal RecyclerView

        homeHorModelList = new ArrayList<>()
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"HamBurger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.makarna,"Pasta"));
        homeHorModelList.add(new HomeHorModel(R.drawable.lahmacun,"Lahmacun"));
        homeHorModelList.add(new HomeHorModel(R.drawable.kofte,"MeatBall"));

        homeHorAdapter = new HomeHorAdapter(this, getActivity(), homeHorModelList);
        homeHorizontalRec.setADapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

         // Vertical RecyclerView

         homeVerModelList = new ArrayList<>();


         homeVerAdapter=new HomeVerAdapter(getActivity(), homeVerModelList);
         homeVerticalRec.setAdapter(homeVerAdapter);
         homeVerticalRec.setLayoutManager(new LinearLAyoutManager(getActivity(), RecyclerView.VERTICAL,false);



        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(), list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);


    }
}

 */