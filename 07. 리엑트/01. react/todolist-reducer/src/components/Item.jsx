import "./Item.css";

const Item = ({id, idDo, content, date, onUpdate, onDelete}) =>{
    
    const onCheckbox = () => {
        onUpdate(id);
    }

    const onClickDelete = () =>{
        onDelete(id );
    }

    return(
        <div className="TodoItem">
            <input type="checkbox" readOnly checked={idDo} onChange={onCheckbox}/>
            <div className="content">{content}</div>
            <div className="date">{new Date(date).toLocaleDateString()}</div>
            <button onClick={onClickDelete}>삭제</button>
        </div>
    );
};

export default Item;