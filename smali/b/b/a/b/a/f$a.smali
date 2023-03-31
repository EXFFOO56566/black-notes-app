.class final Lb/b/a/b/a/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/a/b/a/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/a/b/a/f;->a(I)Lb/b/a/b/a/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private a:I

.field final synthetic b:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb/b/a/b/a/f$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lb/b/a/b/a/f$a;->a:I

    return-void
.end method


# virtual methods
.method public a(Lb/b/a/b/a/a;I)Z
    .locals 0

    sget-object p2, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    if-ne p1, p2, :cond_1

    iget p1, p0, Lb/b/a/b/a/f$a;->a:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lb/b/a/b/a/f$a;->a:I

    iget p2, p0, Lb/b/a/b/a/f$a;->b:I

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
