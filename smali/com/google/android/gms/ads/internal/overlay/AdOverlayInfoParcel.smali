.class public final Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
.super Lcom/google/android/gms/common/internal/w/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lcom/google/android/gms/ads/internal/overlay/d;

.field public final c:Lcom/google/android/gms/internal/ads/jm2;

.field public final d:Lcom/google/android/gms/ads/internal/overlay/o;

.field public final e:Lcom/google/android/gms/internal/ads/ws;

.field public final f:Lcom/google/android/gms/internal/ads/n4;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Lcom/google/android/gms/ads/internal/overlay/t;

.field public final k:I

.field public final l:I

.field public final m:Ljava/lang/String;

.field public final n:Lcom/google/android/gms/internal/ads/fo;

.field public final o:Ljava/lang/String;

.field public final p:Lcom/google/android/gms/ads/internal/g;

.field public final q:Lcom/google/android/gms/internal/ads/l4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/overlay/m;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/overlay/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/ads/internal/overlay/d;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;ZLjava/lang/String;Landroid/os/IBinder;IILjava/lang/String;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/ads/internal/g;Landroid/os/IBinder;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    invoke-static {p2}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/jm2;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    invoke-static {p3}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-static {p4}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ws;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-static/range {p16 .. p16}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/l4;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    invoke-static {p5}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/n4;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    move v1, p7

    iput-boolean v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    invoke-static {p9}, Lb/c/b/a/d/a$a;->a(Landroid/os/IBinder;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-static {v1}, Lb/c/b/a/d/b;->Q(Lb/c/b/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/ads/internal/overlay/t;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    move v1, p10

    iput v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    move v1, p11

    iput v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/internal/overlay/d;Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    const/4 p2, -0x1

    iput p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/4 p2, 0x4

    iput p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ILcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/ads/internal/g;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    iput p5, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/4 p2, 0x1

    iput p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILcom/google/android/gms/internal/ads/fo;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    iput p6, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILjava/lang/String;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    iput p8, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;Lcom/google/android/gms/internal/ads/ws;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/fo;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/w/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    iput p8, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    .locals 2

    const-string v0, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    const-class v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Landroid/content/Intent;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    const-string v1, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->b:Lcom/google/android/gms/ads/internal/overlay/d;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->c:Lcom/google/android/gms/internal/ads/jm2;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->d:Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->e:Lcom/google/android/gms/internal/ads/ws;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    const/4 v3, 0x5

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->f:Lcom/google/android/gms/internal/ads/n4;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Z

    const/16 v3, 0x8

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Ljava/lang/String;

    const/16 v3, 0x9

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lcom/google/android/gms/ads/internal/overlay/t;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    const/16 v3, 0xa

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:I

    const/16 v3, 0xb

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:I

    const/16 v3, 0xc

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    const/16 v3, 0xd

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lcom/google/android/gms/internal/ads/fo;

    const/16 v3, 0xe

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:Ljava/lang/String;

    const/16 v3, 0x10

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:Lcom/google/android/gms/ads/internal/g;

    const/16 v3, 0x11

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Lcom/google/android/gms/internal/ads/l4;

    invoke-static {p2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/16 v1, 0x12

    invoke-static {p1, v1, p2, v2}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/w/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
