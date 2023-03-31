.class public final Lcom/google/android/gms/internal/ads/ok2$a;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/ok2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/ok2$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/ok2$a;",
        "Lcom/google/android/gms/internal/ads/ok2$a$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static final zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/ok2$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzbwm:I

.field private zzbwn:Lcom/google/android/gms/internal/ads/ok2$d;

.field private zzbwo:Lcom/google/android/gms/internal/ads/ok2$e;

.field private zzdl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ok2$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ok2$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    const-class v1, Lcom/google/android/gms/internal/ads/ok2$a;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ok2$a;Lcom/google/android/gms/internal/ads/ok2$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ok2$a;->a(Lcom/google/android/gms/internal/ads/ok2$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ok2$a;Lcom/google/android/gms/internal/ads/ok2$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ok2$a;->a(Lcom/google/android/gms/internal/ads/ok2$d;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ok2$a;Lcom/google/android/gms/internal/ads/ok2$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ok2$a;->a(Lcom/google/android/gms/internal/ads/ok2$e;)V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ok2$b;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ok2$b;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwm:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ok2$d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwn:Lcom/google/android/gms/internal/ads/ok2$d;

    iget p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ok2$e;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwo:Lcom/google/android/gms/internal/ads/ok2$e;

    iget p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/ads/ok2$a;->zzdl:I

    return-void
.end method

.method public static p()Lcom/google/android/gms/internal/ads/ok2$a$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->j()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ok2$a$a;

    return-object v0
.end method

.method static synthetic q()Lcom/google/android/gms/internal/ads/ok2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/hk2;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/ok2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/ok2$a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/ok2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/ok2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdl"

    aput-object v0, p1, p2

    const-string p2, "zzbwm"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    invoke-static {}, Lcom/google/android/gms/internal/ads/ok2$b;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzbwn"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzbwo"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/ok2$a;->zzbwp:Lcom/google/android/gms/internal/ads/ok2$a;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000c\u0000\u0002\t\u0001\u0003\t\u0002"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/ok2$a$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/ok2$a$a;-><init>(Lcom/google/android/gms/internal/ads/hk2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/ok2$a;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/ok2$a;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
