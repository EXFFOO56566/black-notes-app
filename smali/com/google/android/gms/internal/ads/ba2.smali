.class public final Lcom/google/android/gms/internal/ads/ba2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/ba2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Ljava/util/Comparator<",
        "Lcom/google/android/gms/internal/ads/ba2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/ba2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:[Lcom/google/android/gms/internal/ads/ba2$a;

.field private c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/da2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/da2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/ba2$a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/ba2$a;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    array-length p1, p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ba2;->d:I

    return-void
.end method

.method private varargs constructor <init>(Z[Lcom/google/android/gms/internal/ads/ba2$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, [Lcom/google/android/gms/internal/ads/ba2$a;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/ba2$a;

    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 p2, 0x1

    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_1

    add-int/lit8 v0, p2, -0x1

    aget-object v0, p1, v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object v0

    aget-object v1, p1, p2

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    aget-object p1, p1, p2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x19

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Duplicate data for uuid: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    array-length p1, p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ba2;->d:I

    return-void
.end method

.method public varargs constructor <init>([Lcom/google/android/gms/internal/ads/ba2$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/ba2;-><init>(Z[Lcom/google/android/gms/internal/ads/ba2$a;)V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/ba2$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ba2$a;

    check-cast p2, Lcom/google/android/gms/internal/ads/ba2$a;

    sget-object v0, Lcom/google/android/gms/internal/ads/p72;->b:Ljava/util/UUID;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/ads/p72;->b:Ljava/util/UUID;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ba2$a;->a(Lcom/google/android/gms/internal/ads/ba2$a;)Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/UUID;->compareTo(Ljava/util/UUID;)I

    move-result p1

    return p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lcom/google/android/gms/internal/ads/ba2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    check-cast p1, Lcom/google/android/gms/internal/ads/ba2;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba2;->c:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/ba2;->c:I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/ba2;->c:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ba2;->b:[Lcom/google/android/gms/internal/ads/ba2$a;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    return-void
.end method
